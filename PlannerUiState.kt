
package sa.edu.iau.cshj.studyplanner

data class PlannerUiState(
    val greeting: String = "Welcome to StudyPlanner!",
    val totalTasks: Int = 7,
    val completedTasks: Int = 0
)
