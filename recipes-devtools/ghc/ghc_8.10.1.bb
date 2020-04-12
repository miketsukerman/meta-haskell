DESCRIPTION = "The Glorious Glasgow Haskell Compilation System"
LICENSE = "GHC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7cb08deb79c4385547f57d6bb2864e0f"

SRC_URI = "https://downloads.haskell.org/~${BPN}/${PV}/${BPN}-${PV}-x86_64-deb9-linux.tar.xz"
SRC_URI[md5sum] = "3d886e9b304d36efb8a71f706dbd8ffa"
SRC_URI[sha256sum] = "d1cf7886f27af070f3b7dbe1975a78b43ef2d32b86362cbe953e79464fe70761"

S = "${WORKDIR}/${BPN}-${PV}"

inherit autotools-brokensep

BBCLASSEXTEND = "native nativesdk" 

EXTRA_OECONF += "" 

do_configure() {
    cd ${S} && ${S}/configure CC=`which gcc` --prefix=${prefix}
}

do_compile() {
}

do_install() {
    cd ${S} && make DESTDIR=${D} install
    
    # Workaround needed cause ghc searches for ghcversion.h and other files in ${WORKDIR}/recipe-sysroot-native/usr/
    # cp -rv ${WORKDIR}/image/home/michael/yocto/poky-warrior/build/tmp/work/x86_64-linux/ghc-native/8.8.2-r0/recipe-sysroot-native/usr/* ${WORKDIR}/recipe-sysroot-native/usr/
    cp -rv ${D}${prefix}/* ${WORKDIR}/recipe-sysroot-native/usr/
}