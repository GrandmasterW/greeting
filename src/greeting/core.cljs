(ns greeting.core
    (:require [reagent.core :as reagent]))

(defonce atomname (reagent/atom "stranger"))

(defn greet [myname]
  [:div
   [:h2 "Hello, " myname "!"]
   [:br]
   [:p "So, that's not you?"]
   [:p "Then, what is your name? "]])

;; -------------------------
;; Views


; manual button section
(defn input-name-field-button []
    [:input.input {:id "name-in"
             :type "text"}])

(defn reset-field []
    (reset! atomname (.-value (.getElementById js/document "name-in"))))

(defn confirm-button []
  [:button.button
   {:type "button"
    :on-click reset-field}
   "OK"])

(defn manual-button []
  [:div.mydiv
   [input-name-field-button]
   [confirm-button]])

; live change

(defn input-name-field-live []
  [:div.mydiv
   [:input.input {:id "name-live"
            :type "text"
            :value @atomname
            :on-change #(reset! atomname (-> % .-target .-value))}]])

; --------------

(defn home-page []
  [:div
   [:h1 "Greeting example"]
   [greet @atomname]
   [manual-button]
   [input-name-field-live]])


;; -------------------------
;; Initialize app

(defn mount-root []
  (reagent/render [home-page] (.getElementById js/document "app")))

(defn init! []
  (mount-root))
