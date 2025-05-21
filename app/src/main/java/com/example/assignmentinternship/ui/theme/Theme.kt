package com.example.assignmentinternship.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.assignmentinternship.R

private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

@Composable
fun AssignmentInternshipTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = AppTypography,
        content = content
    )
}
val ManropeFont = FontFamily(
    Font(R.font.manrope_regular, FontWeight.Normal),
    Font(R.font.manrope_semibold, FontWeight.SemiBold),
    Font(R.font.manrope_bold, FontWeight.Bold)
)
val AppTypography = Typography(
    displayLarge = TextStyle(fontFamily = ManropeFont, fontWeight = FontWeight.Bold, fontSize = 30.sp),
    titleLarge = TextStyle(fontFamily = ManropeFont, fontWeight = FontWeight.SemiBold, fontSize = 20.sp),
    bodyLarge = TextStyle(fontFamily = ManropeFont, fontWeight = FontWeight.Normal, fontSize = 16.sp),
    labelLarge = TextStyle(fontFamily = ManropeFont, fontWeight = FontWeight.Normal, fontSize = 14.sp)
)
@Composable
fun MyAppTheme(darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
               dynamicColor: Boolean = true,
               content: @Composable () -> Unit)
               {
                   val colorScheme = when {
                       dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
                           val context = LocalContext.current
                           if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
                       }

                       darkTheme -> DarkColorScheme
                       else -> LightColorScheme
                   }
    MaterialTheme(
        colorScheme = lightColorScheme(), // or darkColorScheme()
        typography = AppTypography,
        content = content
    )
}