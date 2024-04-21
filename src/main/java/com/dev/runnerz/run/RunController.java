package com.dev.runnerz.run;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/runs")
public class RunController {

    private final RunRepository runRepository;

    public RunController(RunRepository runRepository)
    {
        this.runRepository = runRepository;
    }

//    GET ALL RUNS
    @GetMapping("")
    List<Run> findAll()
    {
        return runRepository.findAll();
    }

//    GET A RUN
    @GetMapping("/{id}")
    Run findById(@PathVariable Integer id)
    {
        Optional<Run> run = runRepository.findById(id);

        if(run.isEmpty())
        {
            throw new RunNotFoundException();
        }

        return run.get();
    }

//    CREATE
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    void Create(@Valid @RequestBody Run run)
    {
        runRepository.create(run);
    }

//    UPDATE
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PatchMapping("/{id}")
    void update(@Valid @RequestBody Run run, @PathVariable Integer id)
    {
        runRepository.update(run, id);
    }

//    Delete
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    void delete(@PathVariable Integer id)
    {
        runRepository.delete(id);
    }
}
