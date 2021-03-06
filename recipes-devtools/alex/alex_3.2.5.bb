DESCRIPTION = "Alex is a tool for generating lexical analysers in Haskell"
SECTION = "devel"
LICENSE = "BSD3"
LIC_FILES_CHKSUM ?= "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://hackage.haskell.org/package/alex-${PV}/alex-${PV}.tar.gz"
SRC_URI[md5sum] = "ed318478389e9538c8356056ddebbea8"
SRC_URI[sha256sum] = "b77c8a1270767c64e2adb21a6e91ee7cd904ba17edae17bc20fd03da5256e0e3"

S = "${WORKDIR}/alex-${PV}"

inherit haskell haskell-package

BBCLASSEXTEND = "native nativesdk" 

FILES_${PN} += "${datadir}/*"