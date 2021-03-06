/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.guilhe.zoocompose.presentation.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = teal700,
    primaryVariant = teal700_alt,
    secondary = teal700,
    onPrimary = Color.White
)

private val LightColorPalette = lightColors(
    primary = red900,
    primaryVariant = red700,
    secondary = red900,
    background = yellow900,
    surface = yellow900_alt,
    onPrimary = Color.White,
    onSecondary = Color.White
)

private val lightOverlayColorPalette = lightColors(
    primary = yellow900_alt_70_alpha,
    onPrimary = Color.Black,
)

private val darkOverlayColorPalette = lightColors(
    primary = black_70_alpha,
    onPrimary = Color.Black,
)

private val lightButtonColorPalette = lightColors(
    primary = red900,
    onPrimary = Color.White,
)

private val darkButtonColorPalette = darkColors(
    primary = teal700,
    onPrimary = Color.White,
)

@Composable
fun AppTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    MaterialTheme(
        colors = if (darkTheme) DarkColorPalette else LightColorPalette,
        typography = mainTypography,
        shapes = shapes,
        content = content
    )
}

@Composable
fun OverlayTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    MaterialTheme(
        colors = if (darkTheme) darkOverlayColorPalette else lightOverlayColorPalette,
        typography = mainTypography,
        shapes = shapes,
        content = content
    )
}

@Composable
fun ButtonTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    MaterialTheme(
        colors = if (darkTheme) darkButtonColorPalette else lightButtonColorPalette,
        typography = mainTypography,
        shapes = shapes,
        content = content
    )
}
