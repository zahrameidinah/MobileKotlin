fun main() {

        // input nilai
        val tugas = 88 // ganti dengan nilai tugas
        val uts = 70 // ganti dengan nilai UTS
        val uas = 60 // ganti dengan nilai  UAS

        // hitung rata rata
        val rataRata = (tugas + uts + uas) / 3.0

        // tentukan grade dan status kelulusan
        val (grade, status) = when {
            rataRata >= 75 -> "A" to "Lulus"
            rataRata in 65.0 .. 74.8 -> "B" to "Lulus"
            rataRata in 55.0..64.0 -> "C" to "Lulus"
            rataRata in 45.0..54.0 -> "D" to "Lulus"
            else -> "E" to "Tidak lulus"
        }

        //tampilkan hasil
        println("rata-rata: $rataRata")
        println("Grade: $grade")
        println("Status: $status")
}