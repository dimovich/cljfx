(ns cljfx.fx.xy-chart-series
  (:require [cljfx.composite :as composite]
            [cljfx.lifecycle :as lifecycle])
  (:import [javafx.scene.chart XYChart$Series]))

(set! *warn-on-reflection* true)

(def props
  (composite/props XYChart$Series
    :data [:list lifecycle/dynamics]
    :name [:setter lifecycle/scalar]
    :node [:setter lifecycle/dynamic]))

(def lifecycle
  (composite/describe XYChart$Series
    :ctor []
    :props props))
