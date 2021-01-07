def hex_to_binary(hex_number: str, num_digits: int = 8) -> str:
    """
    Converts a hexadecimal value into a string representation
    of the corresponding binary value
    Args:
        hex_number: str hexadecimal value
        num_digits: integer value for length of binary value.
                    defaults to 8

    Returns:
        string representation of a binary number 0-padded
        to a minimum length of <num_digits>
    """
    return str(int(hex_number, 16)).zfill(num_digits)
