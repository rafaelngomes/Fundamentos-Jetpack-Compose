package rafaelngomes.com.github.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import rafaelngomes.com.github.R

@Composable
fun SimpleText() {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            text = stringResource(id = R.string.hello_turma),
            color = Color.Blue,
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
    }

}
@Composable
fun TextShadow(){
    val offset = Offset(x = 5f, y=10f)
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.White)
    ) {
       Text(
           text = stringResource(id = R.string.hello_turma),
           textAlign = TextAlign.Center,
           style = TextStyle(
               fontSize = 24.sp,
               shadow = Shadow(color = Color.Blue, offset=offset, blurRadius = 5f)
           )
       )
    }
}
@Composable
fun DifferentFont(){
    val fontFamilyEDU = FontFamily(
        Font(R.font.edu_nswact_cursive_bold),
        Font(R.font.edu_nswact_cursive_regular),
        Font(R.font.edu_nswact_cursive_medium),
        Font(R.font.edu_nswact_cursive_semibold)
    )

    Column {
        Text(text = stringResource(R.string.hello_turma), fontFamily = FontFamily.Serif)
        Text(text = stringResource(R.string.hello_turma), fontFamily = FontFamily.Monospace)

        Spacer(modifier = Modifier.height(8.dp))

       Text(
            text = "Edu NSWACT Cursive regular. Eu preciso colocar um texto gigante neste local!",
            fontFamily = fontFamilyEDU,
            fontWeight = FontWeight.Normal,
            maxLines = 1
        )
        Text(
            text = "Edu NSWACT Cursive medium. Eu preciso colocar outro texto gigante neste local!",
            fontFamily = fontFamilyEDU,
            fontWeight = FontWeight.Medium,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
        Text(
            text = "Edu NSWACT Cursive semibold",
            fontFamily = fontFamilyEDU,
            fontWeight = FontWeight.SemiBold
        )
        Text(
            text = "Edu NSWACT Cursive bold",
            fontFamily = fontFamilyEDU,
            fontWeight = FontWeight.Bold
        )
    }
}
@Preview
@Composable
fun Preview() {
    //TextShadow()
    DifferentFont()
}
