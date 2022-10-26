(ns core
  (:require [bips.bip39 :as bip39]))

(defn -main [& args]
  (bip39/check-mnemonic "option kiss fix pitch skate inform alone need work course image style hope arrest omit"))
