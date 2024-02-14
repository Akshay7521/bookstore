package com.example;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import static jakarta.ws.rs.core.MediaType.APPLICATION_JSON;
import static jakarta.ws.rs.core.MediaType.TEXT_PLAIN;

@Path("/api/books")
@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
public class BookResource {

    @GET
    public Response getBooks() {
        List<Book> books = new ArrayList<>();
        //get all the books from database

        if (books.isEmpty()) return Response.noContent().build();

        return Response.ok(books).build();

    }

    @GET
    @Path("/{id}")
    public Response getBookById( @PathParam("id") Long id) {
        Book book = null;
			// get the book from database
        if ( book == null ) return Response.status(Response.Status.NOT_FOUND).build();

        return Response.ok(book).build();
    }

    @GET
    @Produces(TEXT_PLAIN)
    @Path("/count")
    public Response countBooks() {
        Long count = 0L;

        if ( count == 0 ) return Response.noContent().build();
        return Response.ok(count).build();
    }

    @POST
    public Response createBook(Book book ) throws URISyntaxException {
        // create and save book in database
        book.setId(1L);
        URI createdURI = new URI(book.getId().toString());

        return Response.created(createdURI).entity(book).build();
    }

    @DELETE
    @Path("/{id}")
    public  Response deleteBook(@PathParam("id") long id) {
        // delete book from database
        return Response.noContent().build();
    }


}
