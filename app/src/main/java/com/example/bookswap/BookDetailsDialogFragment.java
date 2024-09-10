package com.example.bookswap;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import com.bumptech.glide.Glide;

public class BookDetailsDialogFragment extends DialogFragment {

    private Book book;

    public BookDetailsDialogFragment(Book book) {
        this.book = book;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the custom dialog layout
        View view = inflater.inflate(R.layout.fragment_book_details_dialog, container, false);

        // Initialize the views
        TextView titleTextView = view.findViewById(R.id.dialog_book_title);
        TextView authorTextView = view.findViewById(R.id.dialog_book_author);
        TextView isbnTextView = view.findViewById(R.id.dialog_book_isbn);
        TextView categoriesTextView = view.findViewById(R.id.dialog_book_genre);
        TextView pageCountTextView = view.findViewById(R.id.dialog_book_page_count);
        TextView descriptionTextView = view.findViewById(R.id.dialog_book_description);
        ImageView bookImageView = view.findViewById(R.id.dialog_book_image);
        Button button1 = view.findViewById(R.id.button1);
        ImageButton closeButton = view.findViewById(R.id.close_dialog);

        // Set the data
        titleTextView.setText(book.getTitle());
        // join authors name
        StringBuilder author = new StringBuilder();
        for (String a : book.getAuthors()) {
            author.append(a);
            // Add a comma and space if not the last author
            if (!a.equals(book.getAuthors()[book.getAuthors().length - 1])) {
                author.append(", ");
            }
        }
        authorTextView.setText(author.toString());
        isbnTextView.setText(String.format("ISBN: %s", book.getIsbn()));
        descriptionTextView.setText(book.getDescription());
        pageCountTextView.setText(String.format("Page Count: %d", book.getPage_count()));
        StringBuilder categories = new StringBuilder();
        for (String c : book.getCategories()) {
            categories.append(c);
            // Add a comma and space if not the last category
            if (!c.equals(book.getCategories()[book.getCategories().length - 1])) {
                categories.append(", ");
            }
        }
        categoriesTextView.setText(categories.toString());

        String thumbnailUrl = book.getImage_links() != null ? book.getImage_links().getThumbnail() : null;
        if (thumbnailUrl != null) {
            Glide.with(requireContext())
                    .load(thumbnailUrl)
                    .placeholder(R.drawable.favourite_book)
                    .error(R.drawable.find_book)
                    .into(bookImageView);
        } else {
            bookImageView.setImageResource(R.drawable.bookread); // Default image if no thumbnail
        }

        // Handle button clicks
        button1.setOnClickListener(v -> {
            //TODO: Add the book to the Library
            Toast.makeText(requireContext(), "Adding the book to Library", Toast.LENGTH_SHORT).show();
        });


        closeButton.setOnClickListener(v -> dismiss());

        return view;
    }
}


