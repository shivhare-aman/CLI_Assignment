package com.image_processing.cli.command;

import com.image_processing.cli.observer.DataSource;

public interface Command {
    void execute(DataSource dataSource);
}
