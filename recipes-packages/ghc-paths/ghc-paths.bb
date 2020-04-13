DESCRIPTION = "Knowledge of GHC's installation directories"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM ?= "file://${COMMON_LICENSE_DIR}/BSD-3-Clause;md5=550794465ba0ec5312d6919e203a55f9"

SRCREV = "7ec445424f169841ddb5316b7437675d8881f486"
SRC_URI = "git://github.com/simonmar/ghc-paths.git;protocol=https;branch=master"

S = "${WORKDIR}/git"

inherit haskell haskell-package

BBCLASSEXTEND = "native nativesdk" 
