(ns cljfx.fx.image-input
  (:require [cljfx.composite :as composite]
            [cljfx.lifecycle :as lifecycle]
            [cljfx.coerce :as coerce])
  (:import [javafx.scene.effect ImageInput]))

(set! *warn-on-reflection* true)

(def props
  (composite/props ImageInput
    :source [:setter lifecycle/scalar :coerce coerce/image]
    :x [:setter lifecycle/scalar :coerce double :default 0]
    :y [:setter lifecycle/scalar :coerce double :default 0]))

(def lifecycle
  (composite/describe ImageInput
    :ctor []
    :props props))
