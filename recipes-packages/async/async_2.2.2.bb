DESCRIPTION = "Run IO operations asynchronously and wait for their results"
SECTION = "devel"
LICENSE = "BSD3"
LIC_FILES_CHKSUM ?= "file://${COMMON_LICENSE_DIR}/BSD-3-Clause;md5=550794465ba0ec5312d6919e203a55f9"

SRC_URI = "git://github.com/simonmar/async.git;protocol=https;tag=${PV}"

S = "${WORKDIR}/git"

inherit haskell haskell-package

BBCLASSEXTEND = "native nativesdk" 
