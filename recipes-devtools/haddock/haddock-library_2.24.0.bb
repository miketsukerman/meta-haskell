include haddock.inc

S = "${WORKDIR}/haddock-haddock-${PV}-release/haddock-library/"

inherit haskell haskell-package

BBCLASSEXTEND = "native nativesdk" 
