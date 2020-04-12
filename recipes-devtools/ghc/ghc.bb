DESCRIPTION = "The Glorious Glasgow Haskell Compilation System"
PV = "8.8.2"
PR = "r0"

LICENSE = "GHC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7cb08deb79c4385547f57d6bb2864e0f"

SRC_URI = "https://downloads.haskell.org/~${BPN}/${PV}/${BPN}-${PV}-x86_64-deb9-linux.tar.xz"
SRC_URI[md5sum] = "f2fa48668602663450c75235912faeb5"
SRC_URI[sha256sum] = "7b2d66c2d5d8c15750da5833d3018634a5eb792a5662282e3abfeb112c2a1cc3"

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