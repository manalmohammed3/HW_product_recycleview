package com.example.hw_product_recycleview.datasource

import com.example.hw_product_recycleview.R
import com.example.hw_product_recycleview.model.data_model

class data {
    fun loadingData():List<data_model>{
       return listOf(
        data_model(R.drawable.iphone,"iphone 12 64gb",4500,true,5),
        data_model(R.drawable.samsung_galaxy_uitra,"samsung galaxy s21 ultra",4500,false,5),
        data_model(R.drawable.xiaomi_pro,"xiaomi 11t pro",2000,true,0),
        data_model(R.drawable.huawei_yp,"huawei y6p", 500,false,0),
        data_model(R.drawable.samsung_galaxy_z_flip,"samsung galaxy z flip3",5000 , true ,70),
        data_model(R.drawable.iphone13,"iphone 13",600, true ,36),
        )
    }
}