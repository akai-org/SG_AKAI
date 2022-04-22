package pl.org.akai.components.layouts

import androidx.compose.animation.*
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.runtime.*
import androidx.compose.ui.layout.ContentScale

@Composable
fun ListScreen(
    titleText: String,
    onItemClicked: (String) -> Unit,
    onAddItemClicked: () -> Unit,
    recipes: List<RecipeEntryData>,
) {
    Column() {
        Text(
            text = titleText,
            style = MaterialTheme.typography.h1,
            modifier = Modifier.padding(top = 16.dp, start = 16.dp, bottom = 24.dp)
        )
        CustomList(recipes = recipes, onItemClicked = onItemClicked, modifier = Modifier.weight(1f))
        Button(
            onClick = { onAddItemClicked() },
            modifier = Modifier
                .padding(bottom = 16.dp)
                .padding(horizontal = 16.dp)
                .clip(RoundedCornerShape(8.dp))
                .fillMaxWidth()
        ) {
            Text(text = "DEMO")
        }
    }
}

data class RecipeEntryData(
    val name: String,
    val surname: String
)

@Composable
fun CustomList(recipes: List<RecipeEntryData>, onItemClicked: (String) -> Unit, modifier: Modifier) {
    val listState = rememberLazyListState()
    SearchBar(listState = listState)
    LazyColumn(modifier = modifier, state = listState) {
        items(recipes.size) { recipe ->
            RecipeEntry(recipes.get(recipe), onItemClicked)
        }
    }
}

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun SearchBar(listState: LazyListState) {
    val scrolledDown by remember {
        derivedStateOf {
            listState.firstVisibleItemIndex > 0
        }
    }
    AnimatedVisibility(
        visible = !scrolledDown,
        enter = slideInVertically() + expandVertically(),
        exit = slideOutVertically() + shrinkVertically()
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .border(BorderStroke(1.dp, Color.Gray), RoundedCornerShape(8.dp))
        ) {
            TextField(
                value = "Search recipe...",
                onValueChange = { /* TODO implement search bar*/ },
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .fillMaxWidth()
            )
        }
    }
}


@Composable
fun RecipeEntry(recipeEntry: RecipeEntryData, onItemClicked: (String) -> Unit) {
    Row(
        modifier = Modifier
            .padding(top = 8.dp)
            .padding(horizontal = 16.dp)
            .fillMaxWidth()
            .border(BorderStroke(1.dp, Color.Gray), RoundedCornerShape(8.dp))
            .clickable { onItemClicked(recipeEntry.name) }
    ) {
        Image(
            imageVector = Icons.Default.Edit,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(96.dp)
                .align(Alignment.CenterVertically)
                .padding(16.dp)
                .background(Color.Gray)
        )
        Column() {
            Text(
                text = recipeEntry.name,
                maxLines = 1,
                style = MaterialTheme.typography.h2,
                modifier = Modifier
                    .padding(top = 8.dp)
            )

            Text(
                text = recipeEntry.surname.toString(),
                maxLines =1,
                style = MaterialTheme.typography.body1,
                modifier = Modifier
                    .padding(top = 8.dp)
            )
        }
    }
}

@Preview("List Screen")
@Composable
fun PreviewListScreen() {
    MaterialTheme {
        Scaffold { innerPadding ->
            ListScreen( titleText = "TYUTUL;", recipes = listOf() , onItemClicked = {}, onAddItemClicked = {})
        }
    }
}