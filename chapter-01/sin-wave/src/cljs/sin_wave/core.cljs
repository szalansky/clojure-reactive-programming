(ns sin-wave.core)

(defn main [])

(def canvas (.getElementById js/document "myCanvas"))

(def ctx (.getContext canvas "2d"))

(.clearReact ctx 0 0 (.-width canvas) (.-height canvas))
