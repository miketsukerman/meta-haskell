include haddock.inc

DEPENDS += "ghc-paths"

S = "${WORKDIR}/haddock-haddock-${PV}-release/haddock-api/"

inherit haskell haskell-package

BBCLASSEXTEND = "native nativesdk" 
