package id.infinitelearning.KotlinSubmission.exercise4

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini

fun main() {
      val string = "ABC"
        val A: Int = try {
            string.toInt()
        }    catch(e: NumberFormatException)   {
            5
        }
        println(A)
}
