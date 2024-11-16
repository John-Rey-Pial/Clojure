(defn isEven? [number]
  (if (= (mod number 2) 0) "yes" "no"))
(isEven? 3)

(defn absval [number]
  (if (> 0 number) (- number) number))
(absval 100)

(defn square [number]
  (* number number))
(square 4)

(defn factorial [n]
  (if (<= n 1)
    1
    (* n (factorial (dec n)))))
(factorial 3)

(reduce + [1 2 3 4 5])

(defn my-flatten [data]
  (mapcat
   (fn [x]
     (if (sequential? x)
       (my-flatten x)
       [x]))
   data))
(my-flatten '(1(2 3 (4 5 6)7 8)))

(defn outer-function [x]
  (letfn [(inner-fn-1 [y] (+ y y))
          (inner-fn-2 [y] (* y y))]
    (inner-fn-2 (inner-fn-1 x))))
(outer-function 5)

(defn list1 [x] x)
(list1 '("This" "list" "contains" "4 elements" "really"))

(filter even? [4 5 6 7 12932 12])

(defn circumference [r]
  (let [pi 3.14159]
    (* 2 pi r)))
(circumference 3)

(defn gcd [a b]
  (if (zero? b)
    a
    (gcd b (mod a b))))
(gcd 101 103)

(def list2 '(1 2 3))
(concat list2 '(4))
list2

(def sample_set #{1 2 3 4})
(contains? sample_set 5)

(+ 3 2)

(def sample_map {:name "John" :age 25 :city "Digos City"})
(get sample_map :name)

(def sample_vector [10 20 30 40])
(sample_vector 0) 

(seq [1 2 3])
(seq '(1 2 3))
(seq #{1 2 3})

(take 4 (map inc (range)))

(def list3 '(1 2 3))
(concat list3 '(4))
list3

(defn calculate-average [numbers]
  (if (seq numbers) 
    (/ (reduce + numbers) (count numbers)) 
    0))
(calculate-average '(1 2 3 4 5))

(for [i (range 0 6)]
  (println i))

(defn comparison1 [arg1 arg2]
  (if (= arg1 arg2)
    (println "The arguments are equal!")
    (println "The arguments are not equal.")))
(comparison1 4 5)

(defn comparison [x y]
  (let [result (compare x y)]
    (cond
      (= result 0) (println "The arguments are equal!")
      (< result 0) (println "The first argument is less than the second.")
      (> result 0) (println "The first argument is greater than the second."))))

(comparison 4 3)
