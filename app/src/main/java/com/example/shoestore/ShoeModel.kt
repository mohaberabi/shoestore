package com.example.shoestore

data class ShoeModel(
    val id: String,
    val name: String,
    val qty: Int,
    val price: Double,
    val company: String,
    val describtion: String,
)


object ShoeConst {


    val shoes = listOf<ShoeModel>(


        ShoeModel("1", "addidas", 10, 200.0, "addidas", "nice shoe "),
        ShoeModel("2", "nike", 10, 200.0, "addidas", "nice shoe "),
        ShoeModel("3", "puma", 13, 200.0, "addidas", "nice shoe "),
        ShoeModel("4", "dummy", 0, 200.0, "addidas", "nice shoe "),
        ShoeModel("5", "dummy", 10, 200.0, "addidas", "nice shoe "),
        ShoeModel("6", "dummy", 10, 200.0, "addidas", "nice shoe "),
        ShoeModel("7", "dummy", 10, 200.0, "addidas", "nice shoe "),

        )
}