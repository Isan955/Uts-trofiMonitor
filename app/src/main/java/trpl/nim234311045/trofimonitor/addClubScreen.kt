import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import trpl.nim234311045.trofimonitor.Club

@Composable
fun AddClubScreen(onClubAdded: (Club) -> Unit) {
    var name by remember { mutableStateOf("") }
    var premierLeague by remember { mutableStateOf("") }
    var faCup by remember { mutableStateOf("") }
    var eflCup by remember { mutableStateOf("") }
    var championsLeague by remember { mutableStateOf("") }
    var europaLeague by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top
    ) {

        StudentInfoScreen()

        Spacer(modifier = Modifier.height(16.dp))

        TextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Club Name") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        TextField(
            value = premierLeague,
            onValueChange = { premierLeague = it },
            label = { Text("Premier League Titles") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        TextField(
            value = faCup,
            onValueChange = { faCup = it },
            label = { Text("FA Cup Titles") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        TextField(
            value = eflCup,
            onValueChange = { eflCup = it },
            label = { Text("EFL Cup Titles") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        TextField(
            value = championsLeague,
            onValueChange = { championsLeague = it },
            label = { Text("Champions League Titles") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        TextField(
            value = europaLeague,
            onValueChange = { europaLeague = it },
            label = { Text("Europa League Titles") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                if (name.isNotEmpty() && premierLeague.isNotEmpty() && faCup.isNotEmpty() &&
                    eflCup.isNotEmpty() && championsLeague.isNotEmpty() && europaLeague.isNotEmpty()
                ) {
                    val newClub = Club(
                        name = name,
                        premierLeague = premierLeague.toInt(),
                        faCup = faCup.toInt(),
                        eflCup = eflCup.toInt(),
                        championsLeague = championsLeague.toInt(),
                        europaLeague = europaLeague.toInt()
                    )
                    onClubAdded(newClub)
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Add Club")
        }
    }
}

@Composable
fun StudentInfoScreen() {
    val studentName = "Muhammad Hasanuddin"
    val studentID = "234311045"

    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        Text(text = "Nama: $studentName", style = MaterialTheme.typography.bodyLarge)
        Text(text = "NIM: $studentID", style = MaterialTheme.typography.bodyLarge)
    }
}
