package model

import com.dzaki_aryavega.rv_buah.R

data class ModelBuah(
    val image : Int ,
    val deskripsi : String
)

object MockList {

    fun getmodel() :List<ModelBuah>{

        val itemmodel1 = ModelBuah(
            R.drawable.apel,
            "apel"
        )

        val itemmodel2 = ModelBuah(
            R.drawable.anggur,
            "anggur"
        )

        val itemmodel3 = ModelBuah(
            R.drawable.jeruk,
            "jeruk"
        )

        val itemmodel4 = ModelBuah(
            R.drawable.pear,
            "pir"
        )

        val itemmodel5 = ModelBuah(
            R.drawable.strawberry,
            "strawberry"
        )

        val itemlist : ArrayList<ModelBuah> = ArrayList()
        itemlist.add(itemmodel1)
        itemlist.add(itemmodel2)
        itemlist.add(itemmodel3)
        itemlist.add(itemmodel4)
        itemlist.add(itemmodel5)

        return itemlist
    }
}