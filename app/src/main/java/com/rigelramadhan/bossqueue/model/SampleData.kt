package com.rigelramadhan.bossqueue.model

object SampleData {
    val placeSampleData = arrayListOf<Place>(
        Place(1, "Hause Rooftop", "Malang", "Hause Rooftop adalah sebuah tempat aestetik yang memberikan pengalaman yang menyegarkan", true, ""),
        Place(2, "Tempat Kedua", "Malang", "deskripsi2", true, ""),
        Place(3, "Tempat Ketiga", "Malang", "deskripsi3", true, ""),
        Place(4, "Tempat Keempat", "Malang", "deskripsi4", true, ""),
        Place(5, "Tempat Kelima", "Malang", "deskripsi5", true, ""),
    )

    val categorySampleData = arrayListOf<Category>(
        Category(1, "Category1", ""),
        Category(2, "Category2", ""),
        Category(3, "Category3", ""),
        Category(4, "Category4", ""),
        Category(5, "Category5", ""),
        Category(6, "Category6", ""),
    )

    val activitySampleData = arrayListOf<Activity>(
        Activity(1, 1, 1, 2, true),
        Activity(2, 1, 1, 3, true),
        Activity(3, 1, 2, 4, true),
        Activity(4, 1, 2, 5, false),
        Activity(5, 1, 3, 7, false),
    )

    val foodSampleData = arrayListOf<Food>(
        Food(1, "Food1", "Ini adalah deskripsi food1", 25600.0, "", 1),
        Food(2, "Food2", "Ini adalah deskripsi food2", 15600.0, "", 1),
        Food(3, "Food3", "Ini adalah deskripsi food3", 35600.0, "", 1),
        Food(4, "Food4", "Ini adalah deskripsi food4", 10600.0, "", 2),
        Food(5, "Food5", "Ini adalah deskripsi food5", 20600.0, "", 2),
        Food(6, "Food6", "Ini adalah deskripsi food6", 30600.0, "", 2),
        Food(7, "Food7", "Ini adalah deskripsi food7", 28600.0, "", 3),
        Food(8, "Food8", "Ini adalah deskripsi food8", 18600.0, "", 3),
        Food(9, "Food9", "Ini adalah deskripsi food9", 48600.0, "", 3),
    )
}