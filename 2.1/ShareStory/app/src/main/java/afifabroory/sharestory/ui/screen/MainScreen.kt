package afifabroory.sharestory.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowInsetsCompat

@Composable
fun MainScreen() {
    Column {
        TopAppBar(
            modifier = Modifier.padding(top = WindowInsetsCompat.Type.statusBars().dp),
            backgroundColor = Color.Magenta
        ) {
            Text("ShareStory")
        }
        Button (
            onClick = {},
            modifier = Modifier.padding(16.dp),
            shape = RoundedCornerShape(16.dp),
            elevation = ButtonDefaults.elevation(5.dp),
        ) {
            Text(text = "Hello World", modifier = Modifier.padding(8.dp))
        }
    }
}

@Preview
@Composable
fun PreviewMainScreen() {
    MainScreen()
}