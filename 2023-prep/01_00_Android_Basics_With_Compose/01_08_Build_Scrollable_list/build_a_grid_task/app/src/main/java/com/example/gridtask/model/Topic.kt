package com.example.gridtask.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(@StringRes val stringRes: Int, val value: Int, @DrawableRes val drawableRes: Int)
