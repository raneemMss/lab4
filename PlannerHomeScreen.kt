
package sa.edu.iau.cshj.studyplanner

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PlannerHomeScreen(
    uiState: PlannerUiState,
    onMarkTaskDone: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        Text(
            uiState.greeting,
            style = MaterialTheme.typography.headlineSmall
        )

        Text(
            "${uiState.completedTasks} of ${uiState.totalTasks} done"
        )

        Button(
            onClick = onMarkTaskDone,
            enabled = uiState.completedTasks < uiState.totalTasks
        ) {
            Text("Mark one more task done")
        }
    }
}

@Preview(showBackground = true, name = "Nothing done yet")
@Composable
private fun PlannerPreviewEmpty() {
    MaterialTheme {
        PlannerHomeScreen(
            uiState = PlannerUiState(completedTasks = 0),
            onMarkTaskDone = {}
        )
    }
}

@Preview(showBackground = true, name = "Everything done")
@Composable
private fun PlannerPreviewComplete() {
    MaterialTheme {
        PlannerHomeScreen(
            uiState = PlannerUiState(completedTasks = 7),
            onMarkTaskDone = {}
        )
    }
}
