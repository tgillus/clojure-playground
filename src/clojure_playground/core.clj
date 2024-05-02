(ns clojure-playground.core)

(defn add
  "add two numbers"
  [x y]
  (+ x y))

(defn greet [name]
  (str "Hello, " name))

(defn messenger
  ([] (messenger "Hello world!"))
  ([msg] (println msg)))

(defn hello [greeting & who]
  (println greeting who))

(defn messenger-builder [greeting]
  (fn [who] (println greeting who)))

(def hello-er
  (messenger-builder "Hello"))

(hello-er "world!")

(defn greet []
  (println "Hello."))

(def greet
  (fn [] (println "Hello again.")))

(def greet
  #(println "Hello for the last time."))

(defn greeting
  ([] (greeting "Hello" "World!"))
  ([x] (greeting "Hello" x))
  ([x y] (str x ", " y "!")))

(defn do-nothing [x]
  x)

(defn always-thing [& x]
  100)

(defn make-thingy [x]
  (fn [& y] x))

(defn triplicate [f]
  (f) (f) (f))

(defn opposite [f]
  (fn [& args] (not (apply f args))))

(defn triplicate2 [f & args]
  (triplicate (fn [] (apply f args))))

(defn cos-of-pi []
  (Math/cos Math/PI))

(defn trig [x]
  (+
    (Math/pow (Math/sin x) 2)
    (Math/pow (Math/cos x) 2)))

(defn http-get [url]
  (slurp url))
