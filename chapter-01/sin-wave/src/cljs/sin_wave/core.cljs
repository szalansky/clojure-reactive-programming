(ns sin-wave.core)

(defn main [])

(def canvas (.getElementById js/document "myCanvas"))

(def ctx (.getContext canvas "2d"))

(.clearRect ctx 0 0 (.-width canvas) (.-height canvas))

(def interval js/Rx.Observable.interval)

; Infinite sequence of numbers
; starts at 0 and will grow every 10 ms
(def time (interval 10))

(.subscribe (.take time 5) (fn [n] (.log js/console n)))

(-> time
  (.take 5)
  (.subscribe (fn [n]
                (.log js/console n))))
