DESCRIPTION = "Happy is a parser generator for Haskell"
SECTION = "devel"
LICENSE = "BSD2"
LIC_FILES_CHKSUM ?= "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

DEPENDS = "ghc-native"

SRC_URI = "https://hackage.haskell.org/package/happy-${PV}/happy-${PV}.tar.gz"
SRC_URI[md5sum] = "56709ae8037295eb74c4793df947d8d2"
SRC_URI[sha256sum] = "fb9a23e41401711a3b288f93cf0a66db9f97da1ce32ec4fffea4b78a0daeb40f"

S = "${WORKDIR}/happy-${PV}"

inherit haskell haskell-package

BBCLASSEXTEND = "native nativesdk" 
