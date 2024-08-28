package com.example.bookswap;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SearchByAuthor extends Fragment {



    private RecyclerView recyclerPopularAuthors;
    private RecyclerView recyclerAuthorsForYou;
    private AuthorAdapter popularAuthorsAdapter;
    private AuthorAdapter authorsForYouAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_search_by_author, container, false);

        // Initialize RecyclerViews
        recyclerPopularAuthors = view.findViewById(R.id.recycler_popular_authors);
        recyclerAuthorsForYou = view.findViewById(R.id.recycler_authors_for_you);

        // Set Layout Managers
        recyclerPopularAuthors.setLayoutManager(new LinearLayoutManager(getContext() , LinearLayoutManager.HORIZONTAL, false));
        recyclerAuthorsForYou.setLayoutManager(new LinearLayoutManager(getContext() , LinearLayoutManager.HORIZONTAL, false));

        // Load data
        List<Author> popularAuthors = loadPopularAuthors();
        List<Author> authorsForYou = loadAuthorsForYou();

        // Set up adapters
        popularAuthorsAdapter = new AuthorAdapter(getContext(), popularAuthors);
        authorsForYouAdapter = new AuthorAdapter(getContext(), authorsForYou);

        // Set adapters to RecyclerViews
        recyclerPopularAuthors.setAdapter(popularAuthorsAdapter);
        recyclerAuthorsForYou.setAdapter(authorsForYouAdapter);

        return view;
    }

    // Mock method to load popular authors data
    private List<Author> loadPopularAuthors() {
        List<Author> authors = new ArrayList<>();
        authors.add(new Author("Author 1", "https://picsum.photos/200/300?random=1"));
        authors.add(new Author("Author 2", "https://picsum.photos/200/300?random=2"));
        authors.add(new Author("Author A", "https://picsum.photos/200/300?random=3"));
        authors.add(new Author("Author B", "https://picsum.photos/200/300?random=4"));
        // Add more authors as needed
        return authors;
    }

    // Mock method to load authors for you data
    private List<Author> loadAuthorsForYou() {
        List<Author> authors = new ArrayList<>();
        authors.add(new Author("Author A", "https://picsum.photos/200/300?random=5"));
        authors.add(new Author("Author B", "https://picsum.photos/200/300?random=6"));
        authors.add(new Author("Author 1", "https://picsum.photos/200/300?random=7"));
        authors.add(new Author("Author 2", "https://picsum.photos/200/300?random=8"));
        // Add more authors as needed
        return authors;
    }
}
