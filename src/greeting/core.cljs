(ns greeting.core
    (:require [reagent.core :as reagent]))

(defonce username (reagent/atom "stranger")) ; the name to greet

(defonce automode (reagent/atom true)) ; true if live update

(def name-field "nameinput") ; const for the input field ID


(defn logc [a & b]
  (.log js/console a))

(defn reset-field []
    (reset! username (.-value (.getElementById js/document name-field))))

(defn changename [p]
  (if @automode
    (reset! username (-> p .-target .-value))))

(defn changemode [p]
    (swap! automode not))

; -----

(defn greet [myname] "generates a greeting for name"
  [:div
   [:h2 "Hello, " myname "!"]
   [:br]
   [:p "So, that's not you?"]
   [:p "Then, what is your name? "]])


(defn confirm-button []
  [:button.button
   {:type "button"
    :on-click reset-field
     :disabled @automode}  ; disabled in automode
   "OK"])

(defn checkbox []
  [:label
   [:input.input
    {:type "checkbox"
     :name :cb
     :value :live
     ; :checked @automode
     :defaultChecked @automode
     :on-click changemode}]
   "live update"])


(defn input-field []
  (if @automode
    [:div.mydiv
     [:input.input {:id name-field
                    :type "text"
                    :value @username
                    :on-change changename}]]
    [:div.mydiv
     [:input.input {:id name-field
                    :type "text"}]]))


; --------------

(defn home-page []
  [:div
   [:h1 "Greeting example"]
   [greet @username]
   [input-field]
   [checkbox]
   [confirm-button]])


;; -------------------------
;; Initialize app

(defn mount-root []
  (reagent/render [home-page] (.getElementById js/document "app")))

(defn init! []
  (mount-root))
