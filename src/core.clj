(ns core
  (:require
    [bips.bip39 :as bip39]
    [buddy.core.codecs :as codecs]))


(defn -main
  [& args]
  (println "check-mnemonic \"option kiss fix pitch skate inform alone need work course image style hope arrest omit\"")
  (println (bip39/check-mnemonic "option kiss fix pitch skate inform alone need work course image style hope arrest omit"))
  ;; => true
  (println "entropy-mnemonic \"000102030405060708090a0b0c0d0e0f\"")
  (println (bip39/entropy->mnemonic (codecs/hex->bytes "000102030405060708090a0b0c0d0e0f")))
  ;; => "abandon amount liar amount expire adjust cage candy arch gather drum buyer"
  (println "mnemonic->seed \"abandon amount liar amount expire adjust cage candy arch gather drum buyer\"")
  (println (bip39/mnemonic->seed "abandon amount liar amount expire adjust cage candy arch gather drum buyer"))
  ;; => "3779b041fab425e9c0fd55846b2a03e9a388fb12784067bd8ebdb464c2574a05bcc7a8eb54d7b2a2c8420ff6
  )

