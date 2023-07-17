package matrices

fun Array<IntArray>.sum(firstMatrix: Array<IntArray>, rows: Int, columns: Int) = run {
    val product = Array(rows) { IntArray(columns) }
    for (i in 0 until rows) {
        for (j in 0 until columns) {
            product[i][j] = this[i][j] + firstMatrix[i][j]
        }
    }
    product
}

fun Array<IntArray>.subtraction(firstMatrix: Array<IntArray>, rows: Int, columns: Int) = run {
    val product = Array(rows) { IntArray(columns) }
    for (i in 0 until rows) {
        for (j in 0 until columns) {
            product[i][j] = this[i][j] - firstMatrix[i][j]
        }
    }
    product
}

fun Array<IntArray>.multiplication(firstMatrix: Array<IntArray>, rows: Int, columns: Int) = run {
    val product = Array(rows) { IntArray(columns) }
    for (i in 0 until rows) {
        for (j in 0 until columns) {
            product[i][j] = this[i][j] * firstMatrix[i][j]
        }
    }
    product
}

fun Array<IntArray>.multiplication(number: Int, rows: Int, columns: Int) = run {
    val product = Array(rows) { IntArray(columns) }
    for (i in 0 until rows) {
        for (j in 0 until columns) {
            product[i][j] = this[i][j] * number
        }
    }
    product
}

fun Array<IntArray>.division(firstMatrix: Array<IntArray>, rows: Int, columns: Int) = run {
    val product = Array(rows) { IntArray(columns) }
    for (i in 0 until rows) {
        for (j in 0 until columns) {
            product[i][j] = this[i][j] / firstMatrix[i][j]
        }
    }
    product
}

fun Array<IntArray>.transpose(rows: Int, columns: Int) = run {
    val transposedMatrix = Array(columns) { IntArray(rows) }
    for (i in 0 until columns) {
        for (j in 0 until rows) {
            transposedMatrix[i][j] = this[j][i]
        }
    }
    transposedMatrix
}
