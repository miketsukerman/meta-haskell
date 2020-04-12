DESCRIPTION = "The Glorious Glasgow Haskell Compilation System"
PV = "3.0.0.0"
PR = "r0"

SECTION = "devel"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = \
    "file://${COMMON_LICENSE_DIR}/MPL-2.0;md5=815ca599c9df247a0c7f619bab123dad"


SRC_URI = "https://downloads.haskell.org/~cabal/${BPN}-latest/${BPN}-${PV}-x86_64-unknown-linux.tar.xz"
SRC_URI[md5sum] = "32352d2259909970e6ff04faf61bbfac"
SRC_URI[sha256sum] = "ee911ba67a70756eedeac662955b896d7e89432a99372aa45d2c6e71fa95a5e4"

S = "${WORKDIR}"

BBCLASSEXTEND = "native nativesdk" 

do_install() {
    install -d ${D}/${bindir}
    install -m 0755 ${S}/cabal ${D}/${bindir}
}