((fn [x] (second (reverse x))) (list 1 2 3 4 5))

((fn [x] (second (reverse x))) ["a" "b" "c"])

((fn [x] (second (reverse x))) [[1 2] [3 4]])
