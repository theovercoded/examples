import ntpath


def extract_filename(filepath: str) -> str:
    """
    Given a filepath string, extract the filename regardless of file separator type
    or presence in the trailing position.
    Args:
        filepath: the filepath string from which to extract the filename
    Returns:
        str object representing the file
    """
    head, tail = ntpath.split(filepath)
    return tail or ntpath.basename(head)
