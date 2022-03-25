package com.watasolutions.w4_t7

import com.watasolutions.w4_t7.model.Idol

/**
 * Created by nampham on 4/16/21.
 */

object DataStore {
    fun getDataSet(): List<Idol> {
        return listOf(
            Idol(1, "Nguyen Quang Hai", "Footballer", R.drawable.quanghai),
            Idol(2,"Bui Tien Dung", "Footballer", R.drawable.buitiendung),
            Idol(3, "Duy Manh", "Footballer", R.drawable.duymanh),
            Idol(4, "Cong Phuong", "Footballer", R.drawable.congphuong),
            Idol(5, "Van Toan", "Footballer", R.drawable.vantoan),
            Idol(6, "Nguyen Quang Hai", "Footballer", R.drawable.quanghai),
            Idol(7,"Bui Tien Dung", "Footballer", R.drawable.buitiendung),
            Idol(8, "Duy Manh", "Footballer", R.drawable.duymanh),
            Idol(9, "Cong Phuong", "Footballer", R.drawable.congphuong),
            Idol(10, "Van Toan", "Footballer", R.drawable.vantoan),
            Idol(11, "Nguyen Quang Hai", "Footballer", R.drawable.quanghai),
            Idol(12,"Bui Tien Dung", "Footballer", R.drawable.buitiendung),
            Idol(13, "Duy Manh", "Footballer", R.drawable.duymanh),
            Idol(14, "Cong Phuong", "Footballer", R.drawable.congphuong),
            Idol(15, "Van Toan", "Footballer", R.drawable.vantoan),
        )
    }
}

