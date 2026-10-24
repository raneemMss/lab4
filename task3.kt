
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun AttendanceScreen(
    uiState: AttendanceUiState,
    onCheckIn: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(uiState.sessionTitle)

        Text("Checked in: ${uiState.checkedInCount}")

        Button(
            onClick = onCheckIn,
            enabled = !uiState.isCheckedIn
        ) {
            Text("Check in")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AttendancePreview() {
    AttendanceScreen(
        AttendanceUiState("CSC 402 - Week 4", 12, false),
        onCheckIn = {}
    )
}

@Preview(showBackground = true)
@Composable
fun AttendanceCheckedInPreview() {
    AttendanceScreen(
        AttendanceUiState("CSC 402 - Week 4", 13, true),
        onCheckIn = {}
    )
}
