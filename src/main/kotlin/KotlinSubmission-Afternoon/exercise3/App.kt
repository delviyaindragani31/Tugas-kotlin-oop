package id.infinitelearning.KotlinSubmission.exercise3

fun main() {

    /** Latihan 1
    Buatlah logika if untuk mengevaluasi nilai score dengan ketentuan:
    1. Jika nilai score lebih atau sama dengan 90
    - Isi variabel result dengan nilai: 'Selamat! Anda mendapatkan nilai A.'
    2. Jika nilai score ada di antara 80 hingga 89
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai B.'
    3. Jika nilai score ada di antara 70 hingga 79
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai C.'
    4. Jika nilai score ada di antara 60 hingga 69:
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai D.'
    5. Jika nilai score di bawah 60:
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai E.'
     */
    // Buat di bawah sini

    print("Input score: ")
    val score = readLine()!!.toInt()
    val message: String

    message = if (80 <= score && score <= 89) {
        "Anda mendapatkan nilai B"
    } else if (70 <= score && score <= 79) {
        "Anda mendapatkan nilai C"
    } else if (60 <= score && score <= 69) {
        "Anda mendapatkan nilai D"
    } else if (score < 60) {
        "Anda mendapatkan nilai E"
    } else {
        "Anda mendapatkan nilai A"
    }

    print (message)
}