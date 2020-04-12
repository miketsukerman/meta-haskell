DESCRIPTION = "Common Architecture for Building Applications and Libraries"
SECTION = "devel"
LICENSE = "BSD3"
LIC_FILES_CHKSUM ?= "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://downloads.haskell.org/~cabal/cabal-install-${PV}/cabal-install-${PV}.tar.gz"
SRC_URI[md5sum] = "cc807bc0114eae46ccc90a4ad3bea877"
SRC_URI[sha256sum] = "a0555e895aaf17ca08453fde8b19af96725da8398e027aa43a49c1658a600cb0"

S = "${WORKDIR}/cabal-install-${PV}"

inherit haskell haskell-package

BBCLASSEXTEND = "native nativesdk" 
