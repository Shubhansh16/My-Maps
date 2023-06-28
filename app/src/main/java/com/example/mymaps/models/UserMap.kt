package com.example.mymaps.models

import android.icu.text.CaseMap.Title

data class UserMap(val title: String, val places: List<Place>) : java.io.Serializable