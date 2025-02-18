def list = [1, 2, 3, 4, 5]

println list.collect { it * 2 }

// Or using map:
// println list.map { it * 2 }

// Expected output and Actual output: [2, 4, 6, 8, 10]