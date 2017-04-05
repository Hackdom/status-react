(ns status-im.components.text-input-with-label.styles
  (:require-macros [status-im.utils.styles :refer [defstyle defnstyle]])
  (:require [status-im.utils.platform :refer [ios?]]))

(defstyle text-input
  {:placeholder  ""
   :android      {:height         24
                  :padding-top    0
                  :padding-bottom 0
                  :padding-left   0
                  :margin-top     26
                  :margin-bottom  4
                  :font-size      16}
   :ios          {:height         26
                  :margin-top     24
                  :margin-bottom  6
                  :font-size      17
                  :letter-spacing -0.2}})

(defstyle component-container
  {:padding-left 16
   :android      {:min-height 76}
   :ios          {:min-height 78}})

(defnstyle label-animated-text [{:keys [label-top label-font-size]}]
  {:position  :absolute
   :top       label-top
   :font-size label-font-size
   :color     "#939ba1"
   :ios       {:letter-spacing -0.2}})

(defstyle description-text
   {:color   "#939ba1"
    :android {:margin-top     6
              :height         14
              :font-size      12}
    :ios     {:margin-top     4
              :height         16
              :font-size      14
              :letter-spacing -0.2}})

(defstyle error-text
   {:color   "#d84b4b"
    :android {:margin-top     6
              :height         14
              :font-size      12}
    :ios     {:margin-top     4
              :height         16
              :font-size      14
              :letter-spacing -0.2}})

(defn underline-blured [error]
  {:background-color (if error "#d84b4b" "#ececf0")
   :align-items      :center})

(defn underline-focused [underline-width underline-height error]
   {:height           underline-height
    :width            underline-width
    :background-color (if error "#d84b4b" "#628fe3")})

(def label-top-top (if ios? 6 6))

(def label-top-bottom (if ios? 26 26))

(def label-font-size-top (if ios? 14 12))

(def label-font-size-bottom (if ios? 17 16))

(def underline-max-height (if ios? 1 2))
