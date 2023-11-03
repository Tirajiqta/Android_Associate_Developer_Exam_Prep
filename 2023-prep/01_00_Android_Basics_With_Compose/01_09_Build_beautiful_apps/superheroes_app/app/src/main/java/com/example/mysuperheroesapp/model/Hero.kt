package com.example.mysuperheroesapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.mysuperheroesapp.R

data class Hero(
    @StringRes val nameRes: Int,
    @StringRes val descriptionRes: Int,
    @DrawableRes val imageRes: Int
)