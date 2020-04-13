DESCRIPTION = "The Glorious Glasgow Haskell Compilation System"
LICENSE = "GHC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7cb08deb79c4385547f57d6bb2864e0f"

DEPENDS = " gmp \ 
            alex-native \
            happy-native \
            gcc-cross-${TARGET_ARCH} \ 
            binutils-cross-${TARGET_ARCH} "

SRCREV = "1941ef4f050c0dfcb68229641fcbbde3a10f1072"
SRC_URI = "gitsm://github.com/ghc/ghc.git;protocol=https;branch=master"

S = "${WORKDIR}/git"

inherit pkgconfig autotools-brokensep haskell perlnative

EXTRA_AUTORECONF += " --exclude=aclocal "
CLEANBROKEN = "1"

# The autodetection in GHC doesn't work, pass some values explicitly here
EXTRA_OECONF += "\
    --host=${BUILD_SYS} \
    --build=${BUILD_SYS} \
    --target=${TARGET_SYS} "

do_configure_prepend() {
    echo "HADDOCK_DOCS=NO" > ${S}/mk/build.mk
    echo "Stage1Only=YES" >> ${S}/mk/build.mk
}
