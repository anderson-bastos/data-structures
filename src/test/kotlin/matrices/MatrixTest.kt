package matrices

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MatrixTest {

    /***
     *  [2,3,4]
     *  [5,2,3]
     */

    @Test
    fun `Should test sum of matrices`() {
        val matrixOne = arrayOf(intArrayOf(2, 3, 4), intArrayOf(5, 2, 3))
        val secondMatrix = matrixOne.clone()

        val sum = matrixOne.sum(secondMatrix, 2, 3)

        Assertions.assertArrayEquals(
            arrayOf(intArrayOf(4, 6, 8), intArrayOf(10, 4, 6)), sum
        )
    }

    @Test
    fun `Should test subtraction of matrices`() {
        val matrixOne = arrayOf(intArrayOf(2, 3, 4), intArrayOf(5, 2, 3))
        val secondMatrix = matrixOne.clone()

        val sum = matrixOne.subtraction(secondMatrix, 2, 3)

        Assertions.assertArrayEquals(
            arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 0, 0)), sum
        )
    }

    @Test
    fun `Should test multiplication of matrices`() {
        val matrixOne = arrayOf(intArrayOf(2, 3, 4), intArrayOf(5, 2, 3))
        val secondMatrix = matrixOne.clone()

        val sum = matrixOne.multiplication(secondMatrix, 2, 3)

        Assertions.assertArrayEquals(
            arrayOf(intArrayOf(4, 9, 16), intArrayOf(25, 4, 9)), sum
        )
    }

    @Test
    fun `Should test multiplication with a number`() {
        val matrixOne = arrayOf(intArrayOf(2, 3, 4), intArrayOf(5, 2, 3))

        val sum = matrixOne.multiplication(2, 2, 3)

        Assertions.assertArrayEquals(
            arrayOf(intArrayOf(4, 6, 8), intArrayOf(10, 4, 6)), sum
        )
    }

    @Test
    fun `Should test division of matrices`() {
        val matrixOne = arrayOf(intArrayOf(2, 3, 4), intArrayOf(5, 2, 3))
        val secondMatrix = matrixOne.clone()

        val sum = matrixOne.division(secondMatrix, 2, 3)

        Assertions.assertArrayEquals(
            arrayOf(intArrayOf(1, 1, 1), intArrayOf(1, 1, 1)), sum
        )
    }

    @Test
    fun `Should test if matrix is transposed`() {
        val matrix = arrayOf(intArrayOf(2, 3, 4), intArrayOf(5, 2, 3))
        Assertions.assertArrayEquals(
            arrayOf(intArrayOf(2, 5), intArrayOf(3, 2), intArrayOf(4, 3)),
            matrix.transpose(2, 3)
        )
    }
}