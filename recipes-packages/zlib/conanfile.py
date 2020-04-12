from conans.model import Generator
from conans import ConanFile,tools, AutoToolsBuildEnvironment
import os


class ZlibPackage(ConanFile):
    name = "zlib"
    version = "0.6.2.1"
    requires = "ghc/8.10.1@haskell/testing"
    url = "https://github.com/miketsukerman/conan-cabal"
    license = "MIT"
    description = "Compression and decompression in the gzip and zlib formats"
    topics = ("ghc", "cabal", "haskell", "zlib")
    settings = "os", "compiler", "build_type", "arch"
    generators = "virtualrunenv"
    scm = {
         "type": "git",
         "subfolder": "zlib",
         "url": "https://github.com/haskell/zlib.git",
         "revision": "refs/tags/{}".format(version)
    }

    def build(self):        
        self.run("ghc -threaded --make Setup", run_environment=True,cwd=self.name)
        self.run(".{}Setup configure --user --prefix={}".format(os.sep,self.package_folder), run_environment=True,cwd=self.name)
        self.run(".{}Setup build".format(os.sep), run_environment=True,cwd=self.name)
        self.run(".{}Setup install".format(os.sep), run_environment=True,cwd=self.name)

    def package(self):
        self.copy("*.dll", dst="bin", keep_path=False)
        self.copy("*.so", dst="lib", keep_path=False)
        self.copy("*.dylib", dst="lib", keep_path=False)
        self.copy("*.a", dst="lib", keep_path=False)
