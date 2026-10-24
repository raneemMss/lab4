
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun AttendanceRoute() {
    var uiState by remember {
        mutableStateOf(
            AttendanceUiState("CSC 402 - Week 4", 12)
        )
    }

    AttendanceScreen(
        uiState = uiState,
        onCheckIn = {
            uiState = uiState.copy(
                checkedInCount =
                    uiState.checkedInCount + 1,
                isCheckedIn = true
            )
        }
    )
}
