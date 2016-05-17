(ns scraper.data-extension)

(defn- isolator-pedal
  "Returns a hash for an isolator pedal"
  [brand model]
  {:brand brand :model model :distributor true :isolator true})

(def extra-pedals
  [{:brand "Strymon" :model "BigSky" :adapter true :comment "TimeLord"}
   (isolator-pedal "Vemuram" "Jan Ray")
   (isolator-pedal "Klon" "Centaur")
   (isolator-pedal "Xotic" "Stereo X Blender")
   (isolator-pedal "JHS" "AT")
   (isolator-pedal "J. Rockett Audio Design" "Guthrie Trapp")])
